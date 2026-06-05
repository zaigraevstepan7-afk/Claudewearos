package oj;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c {
    public static final c A;
    public static final /* synthetic */ c[] B;

    /* renamed from: b, reason: collision with root package name */
    public static final c f12536b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f12537c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f12538d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f12539e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f12540f;

    /* renamed from: z, reason: collision with root package name */
    public static final c f12541z;

    /* renamed from: a, reason: collision with root package name */
    public final TimeUnit f12542a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f12536b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        f12537c = cVar2;
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f12538d = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        f12539e = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f12540f = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f12541z = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        A = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        B = cVarArr;
        u0.c.j(cVarArr);
    }

    public c(String str, int i10, TimeUnit timeUnit) {
        this.f12542a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) B.clone();
    }
}
