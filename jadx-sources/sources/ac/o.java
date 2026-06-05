package ac;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import java.nio.MappedByteBuffer;
import r5.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f416b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f415a = i10;
        this.f416b = obj;
    }

    private final void a() {
        s sVar = (s) this.f416b;
        synchronized (sVar.f13758d) {
            try {
                if (sVar.A == null) {
                    return;
                }
                try {
                    q4.h hVarC = sVar.c();
                    int i10 = hVarC.f13231f;
                    if (i10 == 2) {
                        synchronized (sVar.f13758d) {
                        }
                    }
                    if (i10 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                    }
                    try {
                        int i11 = p4.g.f12796a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        lh.e eVar = sVar.f13757c;
                        Context context = sVar.f13755a;
                        eVar.getClass();
                        q4.h[] hVarArr = {hVarC};
                        uk.c cVar = l4.f.f9974a;
                        Trace.beginSection(yd.f.l0("TypefaceCompat.createFromFontInfo"));
                        try {
                            Typeface typefaceT = l4.f.f9974a.t(context, hVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferK = wd.a.K(sVar.f13755a, hVarC.f13226a);
                            if (mappedByteBufferK == null || typefaceT == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                a8.j jVar = new a8.j(typefaceT, x8.a.T(mappedByteBufferK));
                                Trace.endSection();
                                synchronized (sVar.f13758d) {
                                    try {
                                        uk.c cVar2 = sVar.A;
                                        if (cVar2 != null) {
                                            cVar2.I(jVar);
                                        }
                                    } finally {
                                    }
                                }
                                sVar.b();
                            } finally {
                                int i12 = p4.g.f12796a;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Throwable th3) {
                    synchronized (sVar.f13758d) {
                        try {
                            uk.c cVar3 = sVar.A;
                            if (cVar3 != null) {
                                cVar3.H(th3);
                            }
                            sVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, pi.e] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, pi.e] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.o.run():void");
    }

    public /* synthetic */ o(zh.g gVar, String str, ai.g gVar2) {
        this.f415a = 1;
        this.f416b = gVar;
    }
}
