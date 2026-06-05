package u6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.h1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f16754k = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final u f16755a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f16756b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16757c;

    /* renamed from: d, reason: collision with root package name */
    public final h1 f16758d;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f16760f;

    /* renamed from: g, reason: collision with root package name */
    public final k f16761g;

    /* renamed from: h, reason: collision with root package name */
    public final m5.a0 f16762h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f16763i = new AtomicBoolean(false);
    public ej.a j = new s1.g(7);

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f16759e = new LinkedHashMap();

    public n0(u uVar, HashMap map, HashMap map2, String[] strArr, boolean z2, h1 h1Var) {
        String lowerCase;
        this.f16755a = uVar;
        this.f16756b = map;
        this.f16757c = z2;
        this.f16758d = h1Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            fj.l.e(lowerCase2, "toLowerCase(...)");
            this.f16759e.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f16756b.get(strArr[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                fj.l.e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i10] = lowerCase2;
        }
        this.f16760f = strArr2;
        for (Map.Entry entry : this.f16756b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            fj.l.e(lowerCase3, "toLowerCase(...)");
            if (this.f16759e.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                fj.l.e(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f16759e;
                linkedHashMap.put(lowerCase4, qi.v.f0(linkedHashMap, lowerCase3));
            }
        }
        this.f16761g = new k(this.f16760f.length);
        this.f16762h = new m5.a0(this.f16760f.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(u6.n0 r4, u6.m r5, vi.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof u6.g0
            if (r0 == 0) goto L16
            r0 = r6
            u6.g0 r0 = (u6.g0) r0
            int r1 = r0.f16709d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f16709d = r1
            goto L1b
        L16:
            u6.g0 r0 = new u6.g0
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.f16707b
            ui.a r6 = ui.a.f17085a
            int r1 = r0.f16709d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.f16706a
            java.util.Set r5 = (java.util.Set) r5
            uk.c.R(r4)
            return r5
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            java.lang.Object r5 = r0.f16706a
            u6.m r5 = (u6.m) r5
            uk.c.R(r4)
            goto L57
        L41:
            uk.c.R(r4)
            ta.n r4 = new ta.n
            r1 = 6
            r4.<init>(r1)
            r0.f16706a = r5
            r0.f16709d = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.b(r1, r4, r0)
            if (r4 != r6) goto L57
            goto L6e
        L57:
            java.util.Set r4 = (java.util.Set) r4
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6f
            r0.f16706a = r4
            r0.f16709d = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = u1.p.g(r5, r1, r0)
            if (r5 != r6) goto L6f
        L6e:
            return r6
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.n0.a(u6.n0, u6.m, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(u6.n0 r8, vi.c r9) throws java.lang.Throwable {
        /*
            u6.u r0 = r8.f16755a
            boolean r1 = r9 instanceof u6.h0
            if (r1 == 0) goto L15
            r1 = r9
            u6.h0 r1 = (u6.h0) r1
            int r2 = r1.f16714d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f16714d = r2
            goto L1a
        L15:
            u6.h0 r1 = new u6.h0
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.f16712b
            ui.a r2 = ui.a.f17085a
            int r3 = r1.f16714d
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            qh.c r0 = r1.f16711a
            uk.c.R(r9)     // Catch: java.lang.Throwable -> L2b
            goto L7f
        L2b:
            r8 = move-exception
            goto La2
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            uk.c.R(r9)
            qh.c r9 = r0.f16793f
            boolean r3 = r9.j()
            qi.u r5 = qi.u.f13522a
            if (r3 == 0) goto La6
            java.util.concurrent.atomic.AtomicBoolean r3 = r8.f16763i     // Catch: java.lang.Throwable -> La0
            r6 = 0
            boolean r3 = r3.compareAndSet(r4, r6)     // Catch: java.lang.Throwable -> La0
            if (r3 != 0) goto L50
            r9.O()
            return r5
        L50:
            ej.a r3 = r8.j     // Catch: java.lang.Throwable -> La0
            java.lang.Object r3 = r3.a()     // Catch: java.lang.Throwable -> La0
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> La0
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> La0
            if (r3 != 0) goto L62
            r9.O()
            return r5
        L62:
            u6.i0 r3 = new u6.i0     // Catch: java.lang.Throwable -> La0
            r5 = 1
            r6 = 0
            r3.<init>(r8, r6, r5)     // Catch: java.lang.Throwable -> La0
            r1.f16711a = r9     // Catch: java.lang.Throwable -> La0
            r1.f16714d = r4     // Catch: java.lang.Throwable -> La0
            b4.e r0 = r0.f16791d     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L98
            java.lang.Object r0 = r0.f1538g     // Catch: java.lang.Throwable -> La0
            w6.b r0 = (w6.b) r0     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = r0.J(r3, r1)     // Catch: java.lang.Throwable -> La0
            if (r0 != r2) goto L7c
            return r2
        L7c:
            r7 = r0
            r0 = r9
            r9 = r7
        L7f:
            java.util.Set r9 = (java.util.Set) r9     // Catch: java.lang.Throwable -> L2b
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L94
            m5.a0 r1 = r8.f16762h     // Catch: java.lang.Throwable -> L2b
            r1.a(r9)     // Catch: java.lang.Throwable -> L2b
            k0.h1 r8 = r8.f16758d     // Catch: java.lang.Throwable -> L2b
            r8.invoke(r9)     // Catch: java.lang.Throwable -> L2b
        L94:
            r0.O()
            return r9
        L98:
            java.lang.String r8 = "connectionManager"
            fj.l.l(r8)     // Catch: java.lang.Throwable -> La0
            throw r6     // Catch: java.lang.Throwable -> La0
        L9e:
            r0 = r9
            goto La2
        La0:
            r8 = move-exception
            goto L9e
        La2:
            r0.O()
            throw r8
        La6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.n0.b(u6.n0, vi.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (u1.p.g(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        if (u1.p.g(r11, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00db, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Type inference failed for: r2v6, types: [u6.m] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d9 -> B:28:0x00dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(u6.n0 r17, u6.f0 r18, int r19, vi.c r20) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.n0.c(u6.n0, u6.f0, int, vi.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r4v5, types: [u6.m] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008d -> B:19:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(u6.n0 r8, u6.f0 r9, int r10, vi.c r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof u6.k0
            if (r0 == 0) goto L16
            r0 = r11
            u6.k0 r0 = (u6.k0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.A = r1
            goto L1b
        L16:
            u6.k0 r0 = new u6.k0
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f16741f
            ui.a r1 = ui.a.f17085a
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f16740e
            int r9 = r0.f16739d
            java.lang.String[] r10 = r0.f16738c
            java.lang.String r2 = r0.f16737b
            u6.m r4 = r0.f16736a
            uk.c.R(r11)
            r11 = r10
            r10 = r4
            goto L90
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            uk.c.R(r11)
            java.lang.String[] r8 = r8.f16760f
            r8 = r8[r10]
            java.lang.String[] r10 = u6.n0.f16754k
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L50:
            if (r9 >= r8) goto L92
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            r5.<init>(r6)
            r5.append(r4)
            r4 = 96
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.f16736a = r10
            r0.f16737b = r2
            r0.f16738c = r11
            r0.f16739d = r9
            r0.f16740e = r8
            r0.A = r3
            java.lang.Object r4 = u1.p.g(r10, r4, r0)
            if (r4 != r1) goto L90
            return r1
        L90:
            int r9 = r9 + r3
            goto L50
        L92:
            pi.o r8 = pi.o.f13011a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.n0.d(u6.n0, u6.f0, int, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(vi.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof u6.l0
            if (r0 == 0) goto L13
            r0 = r8
            u6.l0 r0 = (u6.l0) r0
            int r1 = r0.f16746d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16746d = r1
            goto L18
        L13:
            u6.l0 r0 = new u6.l0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f16744b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f16746d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            qh.c r0 = r0.f16743a
            uk.c.R(r8)     // Catch: java.lang.Throwable -> L29
            goto L5c
        L29:
            r8 = move-exception
            goto L6a
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            uk.c.R(r8)
            u6.u r8 = r7.f16755a
            qh.c r2 = r8.f16793f
            boolean r4 = r2.j()
            if (r4 == 0) goto L6e
            ab.s r4 = new ab.s     // Catch: java.lang.Throwable -> L68
            r5 = 23
            r6 = 0
            r4.<init>(r7, r6, r5)     // Catch: java.lang.Throwable -> L68
            r0.f16743a = r2     // Catch: java.lang.Throwable -> L68
            r0.f16746d = r3     // Catch: java.lang.Throwable -> L68
            b4.e r8 = r8.f16791d     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L60
            java.lang.Object r8 = r8.f1538g     // Catch: java.lang.Throwable -> L68
            w6.b r8 = (w6.b) r8     // Catch: java.lang.Throwable -> L68
            java.lang.Object r8 = r8.J(r4, r0)     // Catch: java.lang.Throwable -> L68
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r0 = r2
        L5c:
            r0.O()
            goto L6e
        L60:
            java.lang.String r8 = "connectionManager"
            fj.l.l(r8)     // Catch: java.lang.Throwable -> L68
            throw r6     // Catch: java.lang.Throwable -> L68
        L66:
            r0 = r2
            goto L6a
        L68:
            r8 = move-exception
            goto L66
        L6a:
            r0.O()
            throw r8
        L6e:
            pi.o r8 = pi.o.f13011a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.n0.e(vi.c):java.lang.Object");
    }
}
