package i2;

import c2.z0;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f8207a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8208b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8209c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8210d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8211e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8212f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8213g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8214h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f8215i;
    public final d j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8216k;

    public e(String str, float f10, float f11, float f12, float f13, long j, int i10, boolean z2, int i11) {
        str = (i11 & 1) != 0 ? "" : str;
        long j4 = (i11 & 32) != 0 ? c2.w.f3058h : j;
        int i12 = (i11 & 64) != 0 ? 5 : i10;
        this.f8207a = str;
        this.f8208b = f10;
        this.f8209c = f11;
        this.f8210d = f12;
        this.f8211e = f13;
        this.f8212f = j4;
        this.f8213g = i12;
        this.f8214h = z2;
        ArrayList arrayList = new ArrayList();
        this.f8215i = arrayList;
        d dVar = new d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = dVar;
        arrayList.add(dVar);
    }

    public static void a(e eVar, ArrayList arrayList, z0 z0Var) {
        if (eVar.f8216k) {
            s2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((d) eVar.f8215i.get(r0.size() - 1)).j.add(new k0("", arrayList, 0, z0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final f b() {
        if (this.f8216k) {
            s2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f8215i;
            if (arrayList.size() <= 1) {
                d dVar = this.j;
                f fVar = new f(this.f8207a, this.f8208b, this.f8209c, this.f8210d, this.f8211e, new g0(dVar.f8196a, dVar.f8197b, dVar.f8198c, dVar.f8199d, dVar.f8200e, dVar.f8201f, dVar.f8202g, dVar.f8203h, dVar.f8204i, dVar.j), this.f8212f, this.f8213g, this.f8214h);
                this.f8216k = true;
                return fVar;
            }
            if (this.f8216k) {
                s2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            d dVar2 = (d) arrayList.remove(arrayList.size() - 1);
            ((d) arrayList.get(arrayList.size() - 1)).j.add(new g0(dVar2.f8196a, dVar2.f8197b, dVar2.f8198c, dVar2.f8199d, dVar2.f8200e, dVar2.f8201f, dVar2.f8202g, dVar2.f8203h, dVar2.f8204i, dVar2.j));
        }
    }
}
