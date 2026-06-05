package com.google.android.gms.internal.ads;

import android.os.Parcel;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbrp extends zzays implements zzbrq {
    public zzbrp() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String string = parcel.readString();
            zzayt.zzc(parcel);
            zze(string);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            zzayt.zzc(parcel);
            zzf(string2);
        } else {
            if (i10 != 3) {
                return false;
            }
            h2 h2Var = (h2) zzayt.zza(parcel, h2.CREATOR);
            zzayt.zzc(parcel);
            zzg(h2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
