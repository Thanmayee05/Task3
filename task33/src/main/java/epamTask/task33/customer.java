package epamTask.task33;

	@Repository
	 interface customer extends JpaRepository<CustomerEntity, Long> 
	{
	    CustomerEntity findByUsername(String username);	    
	}

}
