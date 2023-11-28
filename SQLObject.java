
interface SQLObject<T> {
    Collection<T> fromResultSet(ResultSet rs);
}
