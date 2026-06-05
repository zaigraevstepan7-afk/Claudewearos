package hd;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends od.a {
    public static final Parcelable.Creator<a> CREATOR = new gd.g(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f7838a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7839b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7840c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7841d;

    /* renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f7842e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f7843f;

    public a(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f7838a = str;
        this.f7839b = str2;
        this.f7840c = str3;
        e0.i(arrayList);
        this.f7841d = arrayList;
        this.f7843f = pendingIntent;
        this.f7842e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e0.l(this.f7838a, aVar.f7838a) && e0.l(this.f7839b, aVar.f7839b) && e0.l(this.f7840c, aVar.f7840c) && e0.l(this.f7841d, aVar.f7841d) && e0.l(this.f7843f, aVar.f7843f) && e0.l(this.f7842e, aVar.f7842e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7838a, this.f7839b, this.f7840c, this.f7841d, this.f7843f, this.f7842e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f7838a, false);
        uk.c.c0(parcel, 2, this.f7839b, false);
        uk.c.c0(parcel, 3, this.f7840c, false);
        uk.c.e0(parcel, 4, this.f7841d);
        uk.c.b0(parcel, 5, this.f7842e, i10, false);
        uk.c.b0(parcel, 6, this.f7843f, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
