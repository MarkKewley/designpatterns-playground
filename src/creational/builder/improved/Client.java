package creational.builder.improved;

public class Client {

	public static void main(String[] args){
		
		// setup the director
		QueryBuildDirector director = new QueryBuildDirector();
		String from="client table";
		String where="client name = ...";
		
		// start building using a sql query
		Query query = director.buildQuery(from, where, new SqlQueryBuilder());
		query.execute();

		// mongo db query builder
		query = director.buildQuery(from, where, new MongoDbQueryBuilder());
		query.execute();
	}
	
}
