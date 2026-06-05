package u3;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {
    public static String a(List list, String str, ej.c cVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i10 & 2) != 0 ? "" : "[\n\t";
        String str3 = (i10 & 4) == 0 ? "\n]" : "";
        if ((i10 & 32) != 0) {
            cVar = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str);
            }
            if (cVar != null) {
                sb2.append((CharSequence) cVar.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static final Void b(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void c(String str) {
        throw new UnsupportedOperationException(str);
    }
}
