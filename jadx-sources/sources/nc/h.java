package nc;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpo;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s3 f12110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzbpo f12112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f12113f;

    public h(p pVar, Context context, s3 s3Var, String str, zzbpo zzbpoVar) {
        this.f12109b = context;
        this.f12110c = s3Var;
        this.f12111d = str;
        this.f12112e = zzbpoVar;
        this.f12113f = pVar;
    }

    @Override // nc.r
    public final Object a() {
        p.k(this.f12109b, "banner");
        return new d3();
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        return d1Var.d(new xd.b(this.f12109b), this.f12110c, this.f12111d, this.f12112e, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // nc.r
    public final /* bridge */ /* synthetic */ Object c() {
        return ((p3) this.f12113f.f12161a).a(this.f12109b, this.f12110c, this.f12111d, this.f12112e, 1);
    }
}
