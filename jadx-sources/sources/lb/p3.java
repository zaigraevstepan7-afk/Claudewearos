package lb;

import java.util.Comparator;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p3 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = ((s) obj).f10635b;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        fj.l.e(lowerCase, "toLowerCase(...)");
        String lowerCase2 = ((s) obj2).f10635b.toLowerCase(locale);
        fj.l.e(lowerCase2, "toLowerCase(...)");
        return mk.b.l(lowerCase, lowerCase2);
    }
}
