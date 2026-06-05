package hd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends od.a {
    public static final Parcelable.Creator<b> CREATOR = new gd.g(8);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7844a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7845b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7846c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7847d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7848e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7849f;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f7850z;

    public b(boolean z2, String str, String str2, boolean z10, String str3, ArrayList arrayList, boolean z11) {
        boolean z12 = true;
        if (z10 && z11) {
            z12 = false;
        }
        e0.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z12);
        this.f7844a = z2;
        if (z2) {
            e0.j(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f7845b = str;
        this.f7846c = str2;
        this.f7847d = z10;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f7849f = arrayList2;
        this.f7848e = str3;
        this.f7850z = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7844a == bVar.f7844a && e0.l(this.f7845b, bVar.f7845b) && e0.l(this.f7846c, bVar.f7846c) && this.f7847d == bVar.f7847d && e0.l(this.f7848e, bVar.f7848e) && e0.l(this.f7849f, bVar.f7849f) && this.f7850z == bVar.f7850z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f7844a), this.f7845b, this.f7846c, Boolean.valueOf(this.f7847d), this.f7848e, this.f7849f, Boolean.valueOf(this.f7850z)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f7844a ? 1 : 0);
        uk.c.c0(parcel, 2, this.f7845b, false);
        uk.c.c0(parcel, 3, this.f7846c, false);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f7847d ? 1 : 0);
        uk.c.c0(parcel, 5, this.f7848e, false);
        uk.c.e0(parcel, 6, this.f7849f);
        uk.c.k0(parcel, 7, 4);
        parcel.writeInt(this.f7850z ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }
}
