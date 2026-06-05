package gd;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends zzbz {
    public static final HashMap A;
    public static final Parcelable.Creator<f> CREATOR = new g(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f7387a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7388b;

    /* renamed from: c, reason: collision with root package name */
    public String f7389c;

    /* renamed from: d, reason: collision with root package name */
    public int f7390d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f7391e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f7392f;

    /* renamed from: z, reason: collision with root package name */
    public final a f7393z;

    static {
        HashMap map = new HashMap();
        A = map;
        map.put("accountType", new sd.a(7, false, 7, false, "accountType", 2, null));
        map.put("status", new sd.a(0, false, 0, false, "status", 3, null));
        map.put("transferBytes", new sd.a(8, false, 8, false, "transferBytes", 4, null));
    }

    public f(HashSet hashSet, int i10, String str, int i11, byte[] bArr, PendingIntent pendingIntent, a aVar) {
        this.f7387a = hashSet;
        this.f7388b = i10;
        this.f7389c = str;
        this.f7390d = i11;
        this.f7391e = bArr;
        this.f7392f = pendingIntent;
        this.f7393z = aVar;
    }

    @Override // sd.b
    public final /* synthetic */ Map getFieldMappings() {
        return A;
    }

    @Override // sd.b
    public final Object getFieldValue(sd.a aVar) {
        int i10 = aVar.f14977z;
        if (i10 == 1) {
            return Integer.valueOf(this.f7388b);
        }
        if (i10 == 2) {
            return this.f7389c;
        }
        if (i10 == 3) {
            return Integer.valueOf(this.f7390d);
        }
        if (i10 == 4) {
            return this.f7391e;
        }
        throw new IllegalStateException(m6.a.d(aVar.f14977z, "Unknown SafeParcelable id="));
    }

    @Override // sd.b
    public final boolean isFieldSet(sd.a aVar) {
        return this.f7387a.contains(Integer.valueOf(aVar.f14977z));
    }

    @Override // sd.b
    public final void setDecodedBytesInternal(sd.a aVar, String str, byte[] bArr) {
        int i10 = aVar.f14977z;
        if (i10 != 4) {
            throw new IllegalArgumentException(m6.a.e(i10, "Field with id=", " is not known to be a byte array."));
        }
        this.f7391e = bArr;
        this.f7387a.add(Integer.valueOf(i10));
    }

    @Override // sd.b
    public final void setIntegerInternal(sd.a aVar, String str, int i10) {
        int i11 = aVar.f14977z;
        if (i11 != 3) {
            throw new IllegalArgumentException(m6.a.e(i11, "Field with id=", " is not known to be an int."));
        }
        this.f7390d = i10;
        this.f7387a.add(Integer.valueOf(i11));
    }

    @Override // sd.b
    public final void setStringInternal(sd.a aVar, String str, String str2) {
        int i10 = aVar.f14977z;
        if (i10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i10)));
        }
        this.f7389c = str2;
        this.f7387a.add(Integer.valueOf(i10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        HashSet hashSet = this.f7387a;
        if (hashSet.contains(1)) {
            uk.c.k0(parcel, 1, 4);
            parcel.writeInt(this.f7388b);
        }
        if (hashSet.contains(2)) {
            uk.c.c0(parcel, 2, this.f7389c, true);
        }
        if (hashSet.contains(3)) {
            int i11 = this.f7390d;
            uk.c.k0(parcel, 3, 4);
            parcel.writeInt(i11);
        }
        if (hashSet.contains(4)) {
            uk.c.V(parcel, 4, this.f7391e, true);
        }
        if (hashSet.contains(5)) {
            uk.c.b0(parcel, 5, this.f7392f, i10, true);
        }
        if (hashSet.contains(6)) {
            uk.c.b0(parcel, 6, this.f7393z, i10, true);
        }
        uk.c.j0(iH0, parcel);
    }
}
