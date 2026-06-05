package nc;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbtj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbpk f12105c;

    public f(Context context, zzbpk zzbpkVar) {
        this.f12104b = context;
        this.f12105c = zzbpkVar;
    }

    @Override // nc.r
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        return d1Var.b(new xd.b(this.f12104b), this.f12105c, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // nc.r
    public final Object c() throws rc.m {
        Context context = this.f12104b;
        xd.b bVar = new xd.b(context);
        try {
            try {
                return zzbtj.zzb(a.a.e0(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl")).zze(bVar, this.f12105c, ModuleDescriptor.MODULE_VERSION);
            } catch (RemoteException | NullPointerException | rc.m unused) {
                return null;
            }
        } catch (Exception e10) {
            throw new rc.m(e10);
        }
    }
}
