package jh;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final /* synthetic */ d[] G;

    /* renamed from: a, reason: collision with root package name */
    public static final d f8942a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f8943b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f8944c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f8945d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f8946e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f8947f;

    /* renamed from: z, reason: collision with root package name */
    public static final d f8948z;

    static {
        d dVar = new d("OK", 0);
        f8942a = dVar;
        d dVar2 = new d("CANCELLED", 1);
        f8943b = dVar2;
        d dVar3 = new d("UNKNOWN", 2);
        f8944c = dVar3;
        d dVar4 = new d("INVALID_ARGUMENT", 3);
        f8945d = dVar4;
        d dVar5 = new d("DEADLINE_EXCEEDED", 4);
        f8946e = dVar5;
        d dVar6 = new d("NOT_FOUND", 5);
        f8947f = dVar6;
        d dVar7 = new d("ALREADY_EXISTS", 6);
        d dVar8 = new d("PERMISSION_DENIED", 7);
        f8948z = dVar8;
        d dVar9 = new d("RESOURCE_EXHAUSTED", 8);
        A = dVar9;
        d dVar10 = new d("FAILED_PRECONDITION", 9);
        d dVar11 = new d("ABORTED", 10);
        B = dVar11;
        d dVar12 = new d("OUT_OF_RANGE", 11);
        d dVar13 = new d("UNIMPLEMENTED", 12);
        C = dVar13;
        d dVar14 = new d("INTERNAL", 13);
        D = dVar14;
        d dVar15 = new d("UNAVAILABLE", 14);
        E = dVar15;
        d dVar16 = new d("DATA_LOSS", 15);
        d dVar17 = new d("UNAUTHENTICATED", 16);
        F = dVar17;
        G = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17};
        SparseArray sparseArray = new SparseArray();
        for (d dVar18 : values()) {
            d dVar19 = (d) sparseArray.get(dVar18.ordinal());
            if (dVar19 != null) {
                throw new IllegalStateException("Code value duplication between " + dVar19 + "&" + dVar18.name());
            }
            sparseArray.put(dVar18.ordinal(), dVar18);
        }
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) G.clone();
    }
}
