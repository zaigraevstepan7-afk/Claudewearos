package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class r implements Comparable, Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new x0(28);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f3883a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3884b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3885c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3886d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3887e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3888f;

    /* renamed from: z, reason: collision with root package name */
    public String f3889z;

    public r(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = z.a(calendar);
        this.f3883a = calendarA;
        this.f3884b = calendarA.get(2);
        this.f3885c = calendarA.get(1);
        this.f3886d = calendarA.getMaximum(7);
        this.f3887e = calendarA.getActualMaximum(5);
        this.f3888f = calendarA.getTimeInMillis();
    }

    public static r a(int i10, int i11) {
        Calendar calendarC = z.c(null);
        calendarC.set(1, i10);
        calendarC.set(2, i11);
        return new r(calendarC);
    }

    public static r b(long j) {
        Calendar calendarC = z.c(null);
        calendarC.setTimeInMillis(j);
        return new r(calendarC);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3883a.compareTo(((r) obj).f3883a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        if (this.f3889z == null) {
            long timeInMillis = this.f3883a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = z.f3904a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f3889z = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f3889z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f3884b == rVar.f3884b && this.f3885c == rVar.f3885c;
    }

    public final int f(r rVar) {
        if (!(this.f3883a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (rVar.f3884b - this.f3884b) + ((rVar.f3885c - this.f3885c) * 12);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3884b), Integer.valueOf(this.f3885c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3885c);
        parcel.writeInt(this.f3884b);
    }
}
