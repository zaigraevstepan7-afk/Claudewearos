package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbsu extends wc.c {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbsu(zzbgg zzbggVar) {
        try {
            this.zzb = zzbggVar.zzg();
        } catch (RemoteException e10) {
            k.e("", e10);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbggVar.zzh()) {
                zzbgn zzbgnVarZzg = obj instanceof IBinder ? zzbgm.zzg((IBinder) obj) : null;
                if (zzbgnVarZzg != null) {
                    this.zza.add(new zzbsw(zzbgnVarZzg));
                }
            }
        } catch (RemoteException e11) {
            k.e("", e11);
        }
    }

    public final List<wc.d> getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
