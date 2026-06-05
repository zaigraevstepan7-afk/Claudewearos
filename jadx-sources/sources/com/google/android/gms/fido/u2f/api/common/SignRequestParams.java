package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import dd.d;
import de.c;
import de.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new d(9);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3733a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f3734b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f3735c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f3736d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3737e;

    /* renamed from: f, reason: collision with root package name */
    public final c f3738f;

    /* renamed from: z, reason: collision with root package name */
    public final String f3739z;

    public SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, ArrayList arrayList, c cVar, String str) {
        this.f3733a = num;
        this.f3734b = d10;
        this.f3735c = uri;
        this.f3736d = bArr;
        this.f3737e = arrayList;
        this.f3738f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                h hVar = (h) obj;
                e0.a("registered key has null appId and no request appId is provided", (hVar.f5109b == null && uri == null) ? false : true);
                String str2 = hVar.f5109b;
                if (str2 != null) {
                    hashSet.add(Uri.parse(str2));
                }
            }
        }
        e0.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f3739z = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        List list = signRequestParams.f3737e;
        if (e0.l(this.f3733a, signRequestParams.f3733a) && e0.l(this.f3734b, signRequestParams.f3734b) && e0.l(this.f3735c, signRequestParams.f3735c) && Arrays.equals(this.f3736d, signRequestParams.f3736d)) {
            List list2 = this.f3737e;
            if (list2.containsAll(list) && list.containsAll(list2) && e0.l(this.f3738f, signRequestParams.f3738f) && e0.l(this.f3739z, signRequestParams.f3739z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3733a, this.f3735c, this.f3734b, this.f3737e, this.f3738f, this.f3739z, Integer.valueOf(Arrays.hashCode(this.f3736d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.Z(parcel, 2, this.f3733a);
        uk.c.W(parcel, 3, this.f3734b);
        uk.c.b0(parcel, 4, this.f3735c, i10, false);
        uk.c.V(parcel, 5, this.f3736d, false);
        uk.c.g0(parcel, 6, this.f3737e, false);
        uk.c.b0(parcel, 7, this.f3738f, i10, false);
        uk.c.c0(parcel, 8, this.f3739z, false);
        uk.c.j0(iH0, parcel);
    }
}
