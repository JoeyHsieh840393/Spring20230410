package spring.mvc.session09.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.session09.service.LottoService;

@Controller
@RequestMapping("/lotto")
public class LottoController {
	@Autowired
	private LottoService lottoService;
	
	// 首頁
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping("/")
	public String index(Model model) {
		List<Set<Integer>> lottos = lottoService.queryAll();
		model.addAttribute("lottos", lottos);
		model.addAttribute("stat", lottoService.getLottoStatistic());
		return "session09/lotto";
	}
	// 取得/新增一筆 lotto
	@GetMapping("/add")
	public String add(Model model) {
		lottoService.add();
		return "redirect:./";  // 重導到 lotto 首頁
	}
	
	// 修改 lotto
	@GetMapping("/update/{index}")
	public String updata(@PathVariable("index") Integer index) {
		lottoService.update(index);
		return "redirect:../";
	}
	
	// 修改 lotto 2
	@GetMapping("/update/{row_index}/{col_index}")
	public String updata(@PathVariable("row_index") Integer rowindex,
						 @PathVariable("col_index") Integer colindex) {
		lottoService.update(rowindex, colindex);
		return "redirect:../../";
	}
	
	// 刪除 lotto
	@GetMapping("/delete/{index}")
	public String delete(@PathVariable("index") Integer index) {
		lottoService.delete(index);
		return "redirect:../";
	}
}
