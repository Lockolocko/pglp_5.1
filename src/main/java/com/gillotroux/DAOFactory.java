/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;
/**
 * Fabrique DAO.
 * @author Lockolocko
 */
public class DAOFactory {
    public static DAO<Personnel> getPersonnelDAO() {
        return new PersonnelDAO();
    }
}
