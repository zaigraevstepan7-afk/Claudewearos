package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.e0;
import gd.g;
import java.util.Arrays;
import java.util.List;
import od.a;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new g(12);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f3459a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3460b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3461c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3462d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3463e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3464f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i10) {
        this.f3459a = pendingIntent;
        this.f3460b = str;
        this.f3461c = str2;
        this.f3462d = list;
        this.f3463e = str3;
        this.f3464f = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = saveAccountLinkingTokenRequest.f3462d;
        List list2 = this.f3462d;
        return list2.size() == list.size() && list2.containsAll(list) && e0.l(this.f3459a, saveAccountLinkingTokenRequest.f3459a) && e0.l(this.f3460b, saveAccountLinkingTokenRequest.f3460b) && e0.l(this.f3461c, saveAccountLinkingTokenRequest.f3461c) && e0.l(this.f3463e, saveAccountLinkingTokenRequest.f3463e) && this.f3464f == saveAccountLinkingTokenRequest.f3464f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3459a, this.f3460b, this.f3461c, this.f3462d, this.f3463e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.b0(parcel, 1, this.f3459a, i10, false);
        c.c0(parcel, 2, this.f3460b, false);
        c.c0(parcel, 3, this.f3461c, false);
        c.e0(parcel, 4, this.f3462d);
        c.c0(parcel, 5, this.f3463e, false);
        c.k0(parcel, 6, 4);
        parcel.writeInt(this.f3464f);
        c.j0(iH0, parcel);
    }
}
