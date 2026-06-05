package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeyy {
    public static void zza(AtomicReference atomicReference, zzeyx zzeyxVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzeyxVar.zza(obj);
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.i("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = l0.f13401b;
            k.h("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }
}
