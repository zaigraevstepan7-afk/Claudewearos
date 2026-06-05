package j2;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import fj.l;
import ld.i;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f8664a;

    /* renamed from: b, reason: collision with root package name */
    public int f8665b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final i f8666c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f8664a = xmlResourceParser;
        i iVar = new i(9, false);
        iVar.f10924b = new float[64];
        this.f8666c = iVar;
    }

    public final float a(TypedArray typedArray, String str, int i10, float f10) {
        if (k4.b.c(this.f8664a, str)) {
            f10 = typedArray.getFloat(i10, f10);
        }
        b(typedArray.getChangingConfigurations());
        return f10;
    }

    public final void b(int i10) {
        this.f8665b = i10 | this.f8665b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.b(this.f8664a, aVar.f8664a) && this.f8665b == aVar.f8665b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8665b) + (this.f8664a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f8664a);
        sb2.append(", config=");
        return m6.a.g(sb2, this.f8665b, ')');
    }
}
