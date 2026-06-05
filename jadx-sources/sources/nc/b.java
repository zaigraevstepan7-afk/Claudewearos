package nc;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbxf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbpk f12093d;

    public b(Context context, String str, zzbpk zzbpkVar) {
        this.f12091b = context;
        this.f12092c = str;
        this.f12093d = zzbpkVar;
    }

    @Override // nc.r
    public final Object a() {
        p.k(this.f12091b, "rewarded");
        return new g3();
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        return d1Var.s(new xd.b(this.f12091b), this.f12092c, this.f12093d, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // nc.r
    public final /* bridge */ /* synthetic */ Object c() {
        return zzbxf.zza(this.f12091b, this.f12092c, this.f12093d);
    }
}
