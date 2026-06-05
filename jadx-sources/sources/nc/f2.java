package nc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f2 extends zzayr implements i2 {
    public f2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // nc.i2
    public final Bundle zze() {
        Parcel parcelZzda = zzda(5, zza());
        Bundle bundle = (Bundle) zzayt.zza(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    @Override // nc.i2
    public final u3 zzf() {
        Parcel parcelZzda = zzda(4, zza());
        u3 u3Var = (u3) zzayt.zza(parcelZzda, u3.CREATOR);
        parcelZzda.recycle();
        return u3Var;
    }

    @Override // nc.i2
    public final String zzg() {
        Parcel parcelZzda = zzda(1, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // nc.i2
    public final String zzh() {
        Parcel parcelZzda = zzda(6, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // nc.i2
    public final String zzi() {
        Parcel parcelZzda = zzda(2, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // nc.i2
    public final List zzj() {
        Parcel parcelZzda = zzda(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzda.createTypedArrayList(u3.CREATOR);
        parcelZzda.recycle();
        return arrayListCreateTypedArrayList;
    }
}
