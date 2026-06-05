package nc;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpo;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12120b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s3 f12121c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzbpo f12123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f12124f;

    public i(p pVar, Context context, s3 s3Var, String str, zzbpo zzbpoVar) {
        this.f12120b = context;
        this.f12121c = s3Var;
        this.f12122d = str;
        this.f12123e = zzbpoVar;
        this.f12124f = pVar;
    }

    @Override // nc.r
    public final Object a() {
        p.k(this.f12120b, "app_open");
        return new d3();
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        return d1Var.g(new xd.b(this.f12120b), this.f12121c, this.f12122d, this.f12123e, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // nc.r
    public final /* bridge */ /* synthetic */ Object c() {
        return ((p3) this.f12124f.f12161a).a(this.f12120b, this.f12121c, this.f12122d, this.f12123e, 4);
    }
}
