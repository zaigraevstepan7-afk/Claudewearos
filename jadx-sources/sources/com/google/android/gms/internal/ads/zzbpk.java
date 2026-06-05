package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbpk extends zzbpn {
    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbpr zzb(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbpk.class.getClassLoader());
                if (tc.e.class.isAssignableFrom(cls)) {
                    return new zzbqp((tc.e) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (tc.a.class.isAssignableFrom(cls)) {
                    return new zzbqp((tc.a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                k.g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th2) {
                k.h("Could not instantiate mediation adapter: " + str + ". ", th2);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            k.b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new zzbqp(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new zzbqp(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbrn zzc(String str) {
        return new zzbsa((RtbAdapter) Class.forName(str, false, zzbrr.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final boolean zzd(String str) {
        try {
            return tc.a.class.isAssignableFrom(Class.forName(str, false, zzbpk.class.getClassLoader()));
        } catch (Throwable unused) {
            k.g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final boolean zze(String str) {
        try {
            return uc.a.class.isAssignableFrom(Class.forName(str, false, zzbpk.class.getClassLoader()));
        } catch (Throwable unused) {
            k.g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
