package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new x0(26);

    /* renamed from: a, reason: collision with root package name */
    public final r f3842a;

    /* renamed from: b, reason: collision with root package name */
    public final r f3843b;

    /* renamed from: c, reason: collision with root package name */
    public final d f3844c;

    /* renamed from: d, reason: collision with root package name */
    public final r f3845d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3846e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3847f;

    /* renamed from: z, reason: collision with root package name */
    public final int f3848z;

    public b(r rVar, r rVar2, d dVar, r rVar3, int i10) {
        Objects.requireNonNull(rVar, "start cannot be null");
        Objects.requireNonNull(rVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f3842a = rVar;
        this.f3843b = rVar2;
        this.f3845d = rVar3;
        this.f3846e = i10;
        this.f3844c = dVar;
        if (rVar3 != null && rVar.f3883a.compareTo(rVar3.f3883a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (rVar3 != null && rVar3.f3883a.compareTo(rVar2.f3883a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > z.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f3848z = rVar.f(rVar2) + 1;
        this.f3847f = (rVar2.f3885c - rVar.f3885c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3842a.equals(bVar.f3842a) && this.f3843b.equals(bVar.f3843b) && Objects.equals(this.f3845d, bVar.f3845d) && this.f3846e == bVar.f3846e && this.f3844c.equals(bVar.f3844c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3842a, this.f3843b, this.f3845d, Integer.valueOf(this.f3846e), this.f3844c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f3842a, 0);
        parcel.writeParcelable(this.f3843b, 0);
        parcel.writeParcelable(this.f3845d, 0);
        parcel.writeParcelable(this.f3844c, 0);
        parcel.writeInt(this.f3846e);
    }
}
