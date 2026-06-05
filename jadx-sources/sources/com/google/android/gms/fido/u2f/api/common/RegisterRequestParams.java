package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import dd.d;
import de.c;
import de.g;
import de.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new d(7);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3726a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f3727b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f3728c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3729d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3730e;

    /* renamed from: f, reason: collision with root package name */
    public final c f3731f;

    /* renamed from: z, reason: collision with root package name */
    public final String f3732z;

    public RegisterRequestParams(Integer num, Double d10, Uri uri, ArrayList arrayList, ArrayList arrayList2, c cVar, String str) {
        this.f3726a = num;
        this.f3727b = d10;
        this.f3728c = uri;
        e0.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f3729d = arrayList;
        this.f3730e = arrayList2;
        this.f3731f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g gVar = (g) obj;
            e0.a("register request has null appId and no request appId is provided", (uri == null && gVar.f5107d == null) ? false : true);
            String str2 = gVar.f5107d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            h hVar = (h) obj2;
            e0.a("registered key has null appId and no request appId is provided", (uri == null && hVar.f5109b == null) ? false : true);
            String str3 = hVar.f5109b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        e0.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f3732z = str;
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        List list2 = registerRequestParams.f3730e;
        return e0.l(this.f3726a, registerRequestParams.f3726a) && e0.l(this.f3727b, registerRequestParams.f3727b) && e0.l(this.f3728c, registerRequestParams.f3728c) && e0.l(this.f3729d, registerRequestParams.f3729d) && (((list = this.f3730e) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && e0.l(this.f3731f, registerRequestParams.f3731f) && e0.l(this.f3732z, registerRequestParams.f3732z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3726a, this.f3728c, this.f3727b, this.f3729d, this.f3730e, this.f3731f, this.f3732z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.Z(parcel, 2, this.f3726a);
        uk.c.W(parcel, 3, this.f3727b);
        uk.c.b0(parcel, 4, this.f3728c, i10, false);
        uk.c.g0(parcel, 5, this.f3729d, false);
        uk.c.g0(parcel, 6, this.f3730e, false);
        uk.c.b0(parcel, 7, this.f3731f, i10, false);
        uk.c.c0(parcel, 8, this.f3732z, false);
        uk.c.j0(iH0, parcel);
    }
}
