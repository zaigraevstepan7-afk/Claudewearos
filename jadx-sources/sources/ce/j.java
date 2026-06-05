package ce;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new x0(4);

    /* renamed from: a, reason: collision with root package name */
    public final zzgx f3279a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f3280b;

    /* renamed from: c, reason: collision with root package name */
    public final zzgx f3281c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f3282d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        com.google.android.gms.common.internal.e0.i(bArr);
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        com.google.android.gms.common.internal.e0.i(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        com.google.android.gms.common.internal.e0.i(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        com.google.android.gms.common.internal.e0.i(zzgxVarZzl);
        this.f3279a = zzgxVarZzl;
        com.google.android.gms.common.internal.e0.i(zzgxVarZzl2);
        this.f3280b = zzgxVarZzl2;
        com.google.android.gms.common.internal.e0.i(zzgxVarZzl3);
        this.f3281c = zzgxVarZzl3;
        com.google.android.gms.common.internal.e0.i(strArr);
        this.f3282d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[Catch: JSONException -> 0x001b, zzho -> 0x0188, TRY_LEAVE, TryCatch #2 {zzho -> 0x0188, blocks: (B:34:0x00ee, B:40:0x010d, B:42:0x011f, B:47:0x0133, B:50:0x0155, B:52:0x016b, B:54:0x0171, B:57:0x018b, B:58:0x0190, B:59:0x0191, B:60:0x0196, B:65:0x01a1, B:67:0x01b1, B:69:0x01bf, B:70:0x01d2, B:71:0x01d7, B:72:0x01d8, B:73:0x01dd, B:78:0x01fe, B:79:0x0203), top: B:109:0x00ee, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fe A[Catch: JSONException -> 0x001b, zzho -> 0x0188, TRY_ENTER, TryCatch #2 {zzho -> 0x0188, blocks: (B:34:0x00ee, B:40:0x010d, B:42:0x011f, B:47:0x0133, B:50:0x0155, B:52:0x016b, B:54:0x0171, B:57:0x018b, B:58:0x0190, B:59:0x0191, B:60:0x0196, B:65:0x01a1, B:67:0x01b1, B:69:0x01bf, B:70:0x01d2, B:71:0x01d7, B:72:0x01d8, B:73:0x01dd, B:78:0x01fe, B:79:0x0203), top: B:109:0x00ee, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject b() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3279a, jVar.f3279a) && com.google.android.gms.common.internal.e0.l(this.f3280b, jVar.f3280b) && com.google.android.gms.common.internal.e0.l(this.f3281c, jVar.f3281c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f3279a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f3280b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f3281c}))});
    }

    public final String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] bArrZzm = this.f3279a.zzm();
        zzbiVarZza.zzb("keyHandle", zzgfVarZzf.zzg(bArrZzm, 0, bArrZzm.length));
        zzgf zzgfVarZzf2 = zzgf.zzf();
        byte[] bArrZzm2 = this.f3280b.zzm();
        zzbiVarZza.zzb("clientDataJSON", zzgfVarZzf2.zzg(bArrZzm2, 0, bArrZzm2.length));
        zzgf zzgfVarZzf3 = zzgf.zzf();
        byte[] bArrZzm3 = this.f3281c.zzm();
        zzbiVarZza.zzb("attestationObject", zzgfVarZzf3.zzg(bArrZzm3, 0, bArrZzm3.length));
        zzbiVarZza.zzb("transports", Arrays.toString(this.f3282d));
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.V(parcel, 2, this.f3279a.zzm(), false);
        uk.c.V(parcel, 3, this.f3280b.zzm(), false);
        uk.c.V(parcel, 4, this.f3281c.zzm(), false);
        uk.c.d0(parcel, 5, this.f3282d, false);
        uk.c.j0(iH0, parcel);
    }
}
