package q4;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f13206a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13207b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13208c;

    /* renamed from: d, reason: collision with root package name */
    public final List f13209d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13210e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13211f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13212g;

    public c(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f13206a = str;
        str2.getClass();
        this.f13207b = str2;
        this.f13208c = str3;
        list.getClass();
        this.f13209d = list;
        this.f13210e = str4;
        this.f13211f = str5;
        this.f13212g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f13206a + ", mProviderPackage: " + this.f13207b + ", mQuery: " + this.f13208c + ", mSystemFont: " + this.f13210e + ", mVariationSettings: " + this.f13211f + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List list = this.f13209d;
            if (i10 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i10++;
        }
    }
}
