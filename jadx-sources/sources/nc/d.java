package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbul;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f12098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbpk f12099c;

    public d(OutOfContextTestingActivity outOfContextTestingActivity, zzbpk zzbpkVar) {
        this.f12098b = outOfContextTestingActivity;
        this.f12099c = zzbpkVar;
    }

    @Override // nc.r
    public final /* bridge */ /* synthetic */ Object a() {
        p.k(this.f12098b, "out_of_context_tester");
        return null;
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f12098b;
        xd.b bVar = new xd.b(outOfContextTestingActivity);
        zzbdc.zza(outOfContextTestingActivity);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjF)).booleanValue()) {
            return d1Var.k(bVar, this.f12099c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }

    @Override // nc.r
    public final Object c() throws rc.m {
        e2 e2Var;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f12098b;
        xd.b bVar = new xd.b(outOfContextTestingActivity);
        zzbdc.zza(outOfContextTestingActivity);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjF)).booleanValue()) {
            try {
                try {
                    IBinder iBinderB = a.a.e0(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (iBinderB == null) {
                        e2Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        e2Var = iInterfaceQueryLocalInterface instanceof e2 ? (e2) iInterfaceQueryLocalInterface : new e2(iBinderB, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    }
                    return e2Var.n(bVar, this.f12099c);
                } catch (Exception e10) {
                    throw new rc.m(e10);
                }
            } catch (RemoteException e11) {
                e = e11;
                zzbul.zza(outOfContextTestingActivity).zzh(e, "ClientApiBroker.getOutOfContextTester");
                return null;
            } catch (NullPointerException e12) {
                e = e12;
                zzbul.zza(outOfContextTestingActivity).zzh(e, "ClientApiBroker.getOutOfContextTester");
                return null;
            } catch (rc.m e13) {
                e = e13;
                zzbul.zza(outOfContextTestingActivity).zzh(e, "ClientApiBroker.getOutOfContextTester");
                return null;
            }
        }
        return null;
    }
}
