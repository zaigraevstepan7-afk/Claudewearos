package r5;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile k f13733k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f13734a;

    /* renamed from: b, reason: collision with root package name */
    public final q.f f13735b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f13736c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f13737d;

    /* renamed from: e, reason: collision with root package name */
    public final f f13738e;

    /* renamed from: f, reason: collision with root package name */
    public final j f13739f;

    /* renamed from: g, reason: collision with root package name */
    public final h9.a f13740g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13741h;

    /* renamed from: i, reason: collision with root package name */
    public final d f13742i;

    public k(t tVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f13734a = reentrantReadWriteLock;
        this.f13736c = 3;
        j jVar = (j) tVar.f13731b;
        this.f13739f = jVar;
        int i10 = tVar.f13730a;
        this.f13741h = i10;
        this.f13742i = (d) tVar.f13732c;
        this.f13737d = new Handler(Looper.getMainLooper());
        this.f13735b = new q.f(0);
        this.f13740g = new h9.a(10);
        f fVar = new f(this);
        this.f13738e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f13736c = 0;
            } catch (Throwable th2) {
                this.f13734a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                jVar.a(new e(fVar));
            } catch (Throwable th3) {
                f(th3);
            }
        }
    }

    public static k a() {
        k kVar;
        synchronized (j) {
            try {
                kVar = f13733k;
                if (!(kVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return kVar;
    }

    public static boolean d() {
        return f13733k != null;
    }

    public final int b(CharSequence charSequence, int i10) {
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        uk.c.p(charSequence, "charSequence cannot be null");
        p1.l lVar = (p1.l) this.f13738e.f13727a;
        lVar.getClass();
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            y[] yVarArr = (y[]) spanned.getSpans(i10, i10 + 1, y.class);
            if (yVarArr.length > 0) {
                return spanned.getSpanStart(yVarArr[0]);
            }
        }
        return ((q) lVar.B(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), com.google.android.gms.common.api.f.API_PRIORITY_OTHER, true, new q(i10))).f13747b;
    }

    public final int c() {
        this.f13734a.readLock().lock();
        try {
            return this.f13736c;
        } finally {
            this.f13734a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.f13741h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (c() == 1) {
            return;
        }
        this.f13734a.writeLock().lock();
        try {
            if (this.f13736c == 0) {
                return;
            }
            this.f13736c = 0;
            this.f13734a.writeLock().unlock();
            f fVar = this.f13738e;
            k kVar = (k) fVar.f13728b;
            try {
                kVar.f13739f.a(new e(fVar));
            } catch (Throwable th2) {
                kVar.f(th2);
            }
        } finally {
            this.f13734a.writeLock().unlock();
        }
    }

    public final void f(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f13734a.writeLock().lock();
        try {
            this.f13736c = 2;
            arrayList.addAll(this.f13735b);
            this.f13735b.clear();
            this.f13734a.writeLock().unlock();
            this.f13737d.post(new b8.f(arrayList, this.f13736c, th2));
        } catch (Throwable th3) {
            this.f13734a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:94:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:94:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca A[Catch: all -> 0x00ff, TRY_ENTER, TryCatch #2 {all -> 0x00ff, blocks: (B:62:0x00ca, B:65:0x00d2, B:47:0x008e), top: B:96:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence g(int r12, int r13, int r14, java.lang.CharSequence r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.k.g(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void h(i iVar) {
        uk.c.p(iVar, "initCallback cannot be null");
        this.f13734a.writeLock().lock();
        try {
            if (this.f13736c == 1 || this.f13736c == 2) {
                this.f13737d.post(new b8.f(Arrays.asList(iVar), this.f13736c, (Throwable) null));
            } else {
                this.f13735b.add(iVar);
            }
            this.f13734a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f13734a.writeLock().unlock();
            throw th2;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        f fVar = this.f13738e;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        s5.b bVar = (s5.b) ((a8.j) fVar.f13729c).f215a;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f14538d).getInt(iA + bVar.f14535a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
