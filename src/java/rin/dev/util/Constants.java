package rin.dev.util;

public class Constants {

    // ===================== DATABASE CONFIGURATION =====================
    /**
     * MySQL connection URL
     */
    public static final String DB_URL = "jdbc:mysql://localhost:3306/savory_whisper";

    /**
     * Database username
     */
    public static final String USER = "root";

    /**
     * Database password
     */
    public static final String PASS = "RiN-123456";

    // ===================== APPLICATION CONSTANTS =====================
    /**
     * Number of related products to display
     */
    public static final int RELATED_NUMBER = 6;

    /**
     * Limit used for certain list queries
     */
    public static final int NUMBER_LIMIT = 12;

    /**
     * Placeholder for optional future use
     */
    public static int UNSIGNED_BYTE_MAX_VALUE;

    // ===================== UI / SESSION CONFIG =====================
    /**
     * Application display name (used in header/footer)
     */
    public static final String APP_NAME = "Savory Whisper";

    /**
     * Session attribute key for the logged-in user object
     */
    public static final String SESSION_USER = "loggedInUser";

    /**
     * Default item counts displayed on the homepage
     */
    public static final int HOME_LATEST_PRODUCT_LIMIT = 6;
    public static final int HOME_LATEST_BLOG_LIMIT = 3;
}
