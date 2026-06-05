package lb;

import android.graphics.Bitmap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f10634a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10635b;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap f10636c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f10637d;

    public s(String str, String str2, Bitmap bitmap, Map map) {
        fj.l.f(bitmap, "icon");
        this.f10634a = str;
        this.f10635b = str2;
        this.f10636c = bitmap;
        this.f10637d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return fj.l.b(this.f10634a, sVar.f10634a) && fj.l.b(this.f10635b, sVar.f10635b) && fj.l.b(this.f10636c, sVar.f10636c) && fj.l.b(this.f10637d, sVar.f10637d);
    }

    public final int hashCode() {
        return this.f10637d.hashCode() + ((this.f10636c.hashCode() + t.m1.c(this.f10634a.hashCode() * 31, 31, this.f10635b)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = t.m1.m("IconPackInfo(packageName=", this.f10634a, ", label=", this.f10635b, ", icon=");
        sbM.append(this.f10636c);
        sbM.append(", mappings=");
        sbM.append(this.f10637d);
        sbM.append(")");
        return sbM.toString();
    }
}
