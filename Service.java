class Service implements SQLObject<Service> {
    public Service() {
        public Service(int ServiceID, String ServiceName, String ServiceAddress1, 
        String ServiceAddress2, int ServiceTypeID, String postcode) {
            this.ServiceID = ServiceID;
            this.ServiceName = ServiceName;
            this.ServiceAddress1 = ServiceAddress1;
            this.ServiceAddress2 = ServiceAddress2;
            this.ServiceTypeID = ServiceTypeID;
            this.postcode = postcode;
        }
    }

    public Collection<Service> fromResultSet(ResultSet rs);
}
