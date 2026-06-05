package nc;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s3 f12126c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f12128e;

    public j(p pVar, Context context, s3 s3Var, String str) {
        this.f12125b = context;
        this.f12126c = s3Var;
        this.f12127d = str;
        this.f12128e = pVar;
    }

    @Override // nc.r
    public final Object a() {
        p.k(this.f12125b, "search");
        return new d3();
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        return d1Var.p(new xd.b(this.f12125b), this.f12126c, this.f12127d, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // nc.r
    public final /* bridge */ /* synthetic */ Object c() {
        return ((p3) this.f12128e.f12161a).a(this.f12125b, this.f12126c, this.f12127d, null, 3);
    }
}
