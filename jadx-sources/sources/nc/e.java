package nc;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbpk f12102c;

    public e(Context context, zzbpk zzbpkVar) {
        this.f12101b = context;
        this.f12102c = zzbpkVar;
    }

    @Override // nc.r
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        return d1Var.m(new xd.b(this.f12101b), this.f12102c, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // nc.r
    public final Object c() throws rc.m {
        Context context = this.f12101b;
        xd.b bVar = new xd.b(context);
        try {
            try {
                return zzbza.zzb(a.a.e0(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl")).zze(bVar, this.f12102c, ModuleDescriptor.MODULE_VERSION);
            } catch (RemoteException | NullPointerException | rc.m unused) {
                return null;
            }
        } catch (Exception e10) {
            throw new rc.m(e10);
        }
    }
}
