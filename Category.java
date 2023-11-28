class Category implements SQLObject<Category> {
    public Category(int serviceID, int ServiceTypeID, String categoryName) {
        this.serviceID = serviceID;
        this.ServiceTypeID = ServiceTypeID;
        this.categoryName = categoryName;
    }
    
    public Collection<Category> fromResultSet(ResultSet rs)
}
