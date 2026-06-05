package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbgh {
    private final zzbgg zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbgh(zzbgg zzbggVar) {
        zzbgn zzbglVar;
        this.zza = zzbggVar;
        try {
            this.zzc = zzbggVar.zzg();
        } catch (RemoteException e10) {
            k.e("", e10);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbggVar.zzh()) {
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbglVar = iInterfaceQueryLocalInterface instanceof zzbgn ? (zzbgn) iInterfaceQueryLocalInterface : new zzbgl(iBinder);
                } else {
                    zzbglVar = null;
                }
                if (zzbglVar != null) {
                    this.zzb.add(new zzbgo(zzbglVar));
                }
            }
        } catch (RemoteException e11) {
            k.e("", e11);
        }
    }

    public final List<ic.c> getImages() {
        return this.zzb;
    }

    public final CharSequence getText() {
        return this.zzc;
    }
}
