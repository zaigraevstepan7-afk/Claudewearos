package ug;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f17083a = Pattern.compile("[\\[\\]\\.#$]");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f17084b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    public static void a(String str) {
        if (f17083a.matcher(str).find()) {
            throw new mg.c(m1.j("Invalid Firebase Database path: ", str, ". Firebase Database paths must not contain '.', '#', '$', '[', or ']'"));
        }
    }

    public static void b(String str) {
        if (str.startsWith(".info")) {
            a(str.substring(5));
        } else if (str.startsWith("/.info")) {
            a(str.substring(6));
        } else {
            a(str);
        }
    }

    public static void c(Object obj) {
        if (!(obj instanceof Map)) {
            if (obj instanceof List) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
                return;
            } else {
                if ((obj instanceof Double) || (obj instanceof Float)) {
                    double dDoubleValue = ((Double) obj).doubleValue();
                    if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
                        throw new mg.c("Invalid value: Value cannot be NaN, Inf or -Inf.");
                    }
                    return;
                }
                return;
            }
        }
        Map map = (Map) obj;
        if (map.containsKey(".sv")) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null || str.length() <= 0 || !(str.equals(".value") || str.equals(".priority") || (!str.startsWith(".") && !f17084b.matcher(str).find()))) {
                throw new mg.c(m1.j("Invalid key: ", str, ". Keys must not contain '/', '.', '#', '$', '[', or ']'"));
            }
            c(entry.getValue());
        }
    }
}
