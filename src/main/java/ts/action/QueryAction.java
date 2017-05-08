package ts.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ts.service.QueryService;

public class QueryAction {
	
	public QueryService queryService;
	
	public void setQueryService(QueryService queryService) {
		this.queryService = queryService;
	}

	public void execService(String name, String code1, String code2, Integer number) throws Exception {
		queryService.inserCity(name, code1, code2, number);
	}
	
	public void execSearch(String name) {
		queryService.searchCityByExample(name);
	}
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:/spring/application-context.xml" });
		QueryAction query = (QueryAction) context.getBean("queryAction");
		
		String name = "Taipei14";
//		query.execService(name, "TWN", "GENM", 56565);
		query.execSearch(name);
	}

}
