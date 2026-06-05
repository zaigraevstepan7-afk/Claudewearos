package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d0 {
    public static final d0 A;
    public static final d0 B;
    public static final d0 C;
    public static final /* synthetic */ d0[] D;

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f4150a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f4151b;

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f4152c;

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f4153d;

    /* renamed from: e, reason: collision with root package name */
    public static final d0 f4154e;

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f4155f;

    /* renamed from: z, reason: collision with root package name */
    public static final d0 f4156z;

    static {
        d0 d0Var = new d0("VOID", 0);
        f4150a = d0Var;
        d0 d0Var2 = new d0("INT", 1);
        f4151b = d0Var2;
        d0 d0Var3 = new d0("LONG", 2);
        f4152c = d0Var3;
        d0 d0Var4 = new d0("FLOAT", 3);
        f4153d = d0Var4;
        d0 d0Var5 = new d0("DOUBLE", 4);
        f4154e = d0Var5;
        d0 d0Var6 = new d0("BOOLEAN", 5);
        f4155f = d0Var6;
        d0 d0Var7 = new d0("STRING", 6);
        f4156z = d0Var7;
        h hVar = i.f4171b;
        d0 d0Var8 = new d0("BYTE_STRING", 7);
        A = d0Var8;
        d0 d0Var9 = new d0("ENUM", 8);
        B = d0Var9;
        d0 d0Var10 = new d0("MESSAGE", 9);
        C = d0Var10;
        D = new d0[]{d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9, d0Var10};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) D.clone();
    }
}
