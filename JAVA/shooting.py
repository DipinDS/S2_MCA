



import pygame # type: ignore
import sys

# Initialize Pygame
pygame.init()

# Set up some constants
WIDTH, HEIGHT = 640, 480
SHIP_WIDTH, SHIP_HEIGHT = 50, 50
BULLET_WIDTH, BULLET_HEIGHT = 10, 20
ALIEN_WIDTH, ALIEN_HEIGHT = 20, 20

# Set up some colors
WHITE = (255, 255, 255)
RED = (255, 0, 0)
BLUE = (0, 0, 255)

# Set up the display
screen = pygame.display.set_mode((WIDTH, HEIGHT))

# Set up the ship
ship = pygame.Rect(WIDTH / 2, HEIGHT - SHIP_HEIGHT - 20, SHIP_WIDTH, SHIP_HEIGHT)

# Set up the bullets
bullets = []

alienXPos = 100
alienYPos = 100

aliens=[]

# for j in range(1,9,1):
#     aliens.append(pygame.Rect(alienXPos, alienYPos, ALIEN_WIDTH, ALIEN_HEIGHT))
#     alienXPos+=50

for i in range(0,2,1):
    for j in range(1,8,1):
        aliens.append(pygame.Rect(alienXPos, alienYPos, ALIEN_WIDTH, ALIEN_HEIGHT))
        alienXPos+=50
    # aliens.append(pygame.Rect(alienXPos, alienYPos, ALIEN_WIDTH, ALIEN_HEIGHT))
    alienYPos+=50


# Set up the aliens
#aliens = [pygame.Rect(100, 100, ALIEN_WIDTH, ALIEN_HEIGHT), pygame.Rect(200, 100, ALIEN_WIDTH, ALIEN_HEIGHT),pygame.Rect(300, 100, ALIEN_WIDTH, ALIEN_HEIGHT)]

# Game loop
while True:
    # Handle events
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()
        elif event.type == pygame.KEYDOWN:
            if event.key == pygame.K_SPACE:
                # Shoot a bullet
                bullet = pygame.Rect(ship.centerx, ship.top, BULLET_WIDTH, BULLET_HEIGHT)
                bullets.append(bullet)

    # Move the ship
    keys = pygame.key.get_pressed()
    if keys[pygame.K_LEFT]:
        ship.x -= 5
    if keys[pygame.K_RIGHT]:
        ship.x += 5

    # Move the bullets
    for bullet in bullets:
        bullet.y -= 5
        if bullet.y < 0:
            bullets.remove(bullet)

    # Move the aliens
    for alien in aliens:
        alien.y += 1
        if alien.x >= WIDTH - ALIEN_WIDTH:
            alien.x = 0

    # Check for collisions
    for bullet in bullets:
        for alien in aliens:
            if bullet.colliderect(alien):
                bullets.remove(bullet)
                aliens.remove(alien)       

    # Draw everything
    screen.fill((0, 0, 0))
    pygame.draw.rect(screen, WHITE, ship)
    for bullet in bullets:
        pygame.draw.rect(screen, RED, bullet)
    for alien in aliens:
        pygame.draw.rect(screen, BLUE, alien)
    pygame.display.flip()

    # Cap the frame rate
    pygame.time.delay(1000 // 60)
