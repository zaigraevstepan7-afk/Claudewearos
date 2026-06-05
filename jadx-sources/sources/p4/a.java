package p4;

import android.os.Build;
import fj.l;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {
    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            i4.b.e(30);
        }
        if (i10 >= 30) {
            i4.b.e(31);
        }
        if (i10 >= 30) {
            i4.b.e(33);
        }
        if (i10 >= 30) {
            i4.b.e(1000000);
        }
    }

    public static final boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return true;
        }
        if (i10 >= 30) {
            String str = Build.VERSION.CODENAME;
            l.e(str, "CODENAME");
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                String upperCase = str.toUpperCase(locale);
                l.e(upperCase, "toUpperCase(...)");
                Integer num = upperCase.equals("BAKLAVA") ? num : null;
                String upperCase2 = "S".toUpperCase(locale);
                l.e(upperCase2, "toUpperCase(...)");
                num = upperCase2.equals("BAKLAVA") ? 0 : null;
                if (num == null || num == null) {
                    if (num == null && num == null) {
                        String upperCase3 = str.toUpperCase(locale);
                        l.e(upperCase3, "toUpperCase(...)");
                        String upperCase4 = "S".toUpperCase(locale);
                        l.e(upperCase4, "toUpperCase(...)");
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    } else if (num != null) {
                        return true;
                    }
                } else if (num.intValue() >= num.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
