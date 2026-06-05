package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzfqb extends zzays implements zzfqc {
    public zzfqb() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                xd.b.n(parcel.readStrongBinder());
                parcel.readString();
                zzayt.zzc(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzayt.zzc(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzayt.zzc(parcel);
                break;
            case 6:
                parcel.readInt();
                zzayt.zzc(parcel);
                break;
            case 7:
                parcel.readInt();
                zzayt.zzc(parcel);
                break;
            case 8:
                xd.b.n(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzayt.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
