package nc;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbfl;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final d1 f12197a;

    static {
        d1 c1Var = null;
        try {
            Object objNewInstance = p.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                c1Var = iInterfaceQueryLocalInterface instanceof d1 ? (d1) iInterfaceQueryLocalInterface : new c1(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
            } else {
                rc.k.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            rc.k.g("Failed to instantiate ClientApi class.");
        }
        f12197a = c1Var;
    }

    public abstract Object a();

    public abstract Object b(d1 d1Var);

    public abstract Object c();

    public final Object d(Context context, boolean z2) {
        boolean z10;
        Object objC;
        Object objB;
        if (!z2) {
            rc.e eVar = s.f12202f.f12203a;
            if (nd.f.f12280b.d(context, 12451000) != 0) {
                rc.k.b("Google Play Services is not available.");
                z2 = true;
            }
        }
        boolean z11 = false;
        boolean z12 = !(yd.e.a(context, ModuleDescriptor.MODULE_ID) <= yd.e.d(context, ModuleDescriptor.MODULE_ID, false));
        zzbdc.zza(context);
        if (((Boolean) zzbex.zza.zze()).booleanValue()) {
            z10 = false;
        } else if (((Boolean) zzbex.zzb.zze()).booleanValue()) {
            z10 = true;
            z11 = true;
        } else {
            z11 = z2 | z12;
            z10 = false;
        }
        d1 d1Var = f12197a;
        Object objB2 = null;
        if (z11) {
            if (d1Var != null) {
                try {
                    objB = b(d1Var);
                } catch (RemoteException e10) {
                    rc.k.h("Cannot invoke local loader using ClientApi class.", e10);
                }
                if (objB == null && !z10) {
                    try {
                        objB2 = c();
                    } catch (RemoteException e11) {
                        rc.k.h("Cannot invoke remote loader.", e11);
                    }
                    objB = objB2;
                }
            } else {
                rc.k.g("ClientApi class cannot be loaded.");
            }
            objB = null;
            if (objB == null) {
                objB2 = c();
                objB = objB2;
            }
        } else {
            try {
                objC = c();
            } catch (RemoteException e12) {
                rc.k.h("Cannot invoke remote loader.", e12);
                objC = null;
            }
            if (objC == null) {
                int iIntValue = ((Long) zzbfl.zza.zze()).intValue();
                s sVar = s.f12202f;
                if (sVar.f12207e.nextInt(iIntValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    rc.e eVar2 = sVar.f12203a;
                    String str = sVar.f12206d.f14321a;
                    eVar2.getClass();
                    rc.e.a(context, str, bundle, new lh.e(eVar2));
                }
            }
            if (objC == null) {
                if (d1Var != null) {
                    try {
                        objB2 = b(d1Var);
                    } catch (RemoteException e13) {
                        rc.k.h("Cannot invoke local loader using ClientApi class.", e13);
                    }
                } else {
                    rc.k.g("ClientApi class cannot be loaded.");
                }
                objB = objB2;
            } else {
                objB = objC;
            }
        }
        return objB == null ? a() : objB;
    }
}
