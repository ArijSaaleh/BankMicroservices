package eg.credit.controller;

import eg.credit.entity.Credit;
import eg.credit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/credit")
public class CreditController {
    @Autowired
    private CreditService creditService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/credits")
    @ResponseBody
    public List<Credit> showAllAgency() {
        List<Credit> listcredit = creditService.listAll();
        return creditService.listAll();
    }

    @GetMapping("/credit/{id}")
    @ResponseBody
    public Credit showOneCredit(@PathVariable("id") int id) {
        return creditService.OneCredit(id);
    }

    @PostMapping("/addCredit")
    @ResponseBody
    public Credit addCredit(@RequestBody Credit ag) {
        return creditService.addCredit(ag);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCredit(@PathVariable("id") long id) {
        creditService.deleteCredit((int) id);
    }

    @PutMapping("/edit/{id}")
    public Credit editCredit(@PathVariable("id") int id, @RequestBody Credit ag) {
        return creditService.updateCredit(id, ag);
    }

    @RequestMapping("/tclient")
    public List<Object> home() {
	/*	JSONObject jsonObject=new JSONObject();
		List<Integer> tst= new ArrayList<Integer>();*/
        List<Object> ls = new ArrayList<Object>();
        List<Credit> c = creditService.listAll();
        List<Integer> al = new ArrayList<Integer>();
        ;
        for (int i = 0; i < c.size(); i++) {
            al.add(c.get(i).getClientId());
        }

        for (int j = 0; j < al.size(); j++) {
		/*jsonObject.put("message-2", restTemplate.exchange(
				"http://localhost:8087/clients/"+al.get(j), HttpMethod.GET,null,Object.class).getBody());*/
            ls.add(restTemplate.exchange(
                    "http://localhost:8586/client/" + al.get(j), HttpMethod.GET, null, Object.class).getBody());

        }
        return Arrays.asList(ls);
    }

}