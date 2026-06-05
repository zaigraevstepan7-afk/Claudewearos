package nc;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpk;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12133b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s3 f12134c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzbpk f12136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f12137f;

    public k(p pVar, Context context, s3 s3Var, String str, zzbpk zzbpkVar) {
        this.f12133b = context;
        this.f12134c = s3Var;
        this.f12135d = str;
        this.f12136e = zzbpkVar;
        this.f12137f = pVar;
    }

    @Override // nc.r
    public final Object a() {
        p.k(this.f12133b, "interstitial");
        return new d3();
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        return d1Var.l(new xd.b(this.f12133b), this.f12134c, this.f12135d, this.f12136e, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // nc.r
    public final /* bridge */ /* synthetic */ Object c() {
        return ((p3) this.f12137f.f12161a).a(this.f12133b, this.f12134c, this.f12135d, this.f12136e, 2);
    }
}
