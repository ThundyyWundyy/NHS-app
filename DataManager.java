import java.util.Collection;

public interface DataManager<T> {
    Collection<Services> loadServiceType(Collection<String> categoryName);
    Collection<LocationData> loadLocationDatas(Collection<String> postcodes);
    Collection<Services> loadRankedServices(Collection<String> postcodes);   
}           
