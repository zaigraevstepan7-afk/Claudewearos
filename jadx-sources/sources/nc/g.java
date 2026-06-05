package nc;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbkz;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzbpk;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbpk f12107c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc.b f12108d;

    public g(Context context, zzbpk zzbpkVar, jc.b bVar) {
        this.f12106b = context;
        this.f12107c = zzbpkVar;
        this.f12108d = bVar;
    }

    @Override // nc.r
    public final /* synthetic */ Object a() {
        return new zzblm();
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        return d1Var.e(new xd.b(this.f12106b), this.f12107c, ModuleDescriptor.MODULE_VERSION, new zzbkz(this.f12108d));
    }

    @Override // nc.r
    public final Object c() throws rc.m {
        Context context = this.f12106b;
        xd.b bVar = new xd.b(context);
        try {
            try {
                return zzblh.zzb(a.a.e0(context).b("com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl")).zze(bVar, this.f12107c, ModuleDescriptor.MODULE_VERSION, new zzbkz(this.f12108d));
            } catch (RemoteException | NullPointerException | rc.m unused) {
                return null;
            }
        } catch (Exception e10) {
            throw new rc.m(e10);
        }
    }
}
