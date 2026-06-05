package ug;

import java.util.HashMap;
import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f17080a = new HashMap();

    public final String a(String str) {
        String strV = m1.v(str, "<value>: null\n");
        HashMap map = this.f17080a;
        if (map.isEmpty()) {
            return m1.w(strV, str, "<empty>");
        }
        for (Map.Entry entry : map.entrySet()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strV);
            sb2.append(str);
            sb2.append(entry.getKey());
            sb2.append(":\n");
            sb2.append(((j) entry.getValue()).a(str + "\t"));
            sb2.append("\n");
            strV = sb2.toString();
        }
        return strV;
    }
}
