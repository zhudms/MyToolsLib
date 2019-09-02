package fun.com.mytoolslib;

/**
 * Created by rongyile on 2018/1/18.
 */

public class IsOnDebug {

    public static boolean isDebug = BuildConfig.DEBUG;

    public static boolean isIsDebug() {
        return isDebug;
    }

    public static void setIsDebug(boolean isDebug) {
        IsOnDebug.isDebug = isDebug;
    }
}
